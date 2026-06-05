# Imagem base com Maven para compilar o projeto Java
FROM maven AS builder

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o arquivo de dependências do Maven
COPY pom.xml .

# Copia o código-fonte da aplicação
COPY src ./src

# Executa o build da aplicação e gera o arquivo .jar
RUN mvn clean package

# Segunda etapa: imagem mais leve apenas para execução
FROM eclipse-temurin

# Define o diretório de trabalho da aplicação
WORKDIR /app

# Copia o .jar gerado na etapa anterior para a imagem final
COPY --from=builder /app/target/*.jar app.jar

# Expõe a porta utilizada pela aplicação
EXPOSE 8080

# Comando executado ao iniciar o container
ENTRYPOINT ["java", "-jar", "app.jar"]
