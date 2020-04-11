FROM com.brymlee.common.composites.development:latest
WORKDIR /com.brymlee.common.composites
RUN mkdir target -p
RUN javac --module-path "target:/root/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.6.1/junit-jupiter-engine-5.6.1.jar" --module com.brymlee.common.composites --module-source-path src/main/java -d target
RUN jar --create --file target/com.brymlee.common.composites.jar --main-class com.brymlee.common.composites.pub.Application -C target/com.brymlee.common.composites .
RUN rm target/com.brymlee.common.composites -rf
CMD ["java", "--module-path", "target", "--module", "com.brymlee.common.composites"]
