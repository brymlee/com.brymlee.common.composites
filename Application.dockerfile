FROM com.brymlee.common.composites.development:latest
WORKDIR com.brymlee.common.composites
RUN javac --module-path target --module com.brymlee.common.composites --module-source-path src/main/java -d target
RUN jar --create --file target/com.brymlee.common.composites.jar --main-class com.brymlee.common.composites.pub.Application -C target/com.brymlee.common.composites .
RUN rm target/com.brymlee.common.composites -rf
CMD ["java", "--module-path", "target", "--module", "com.brymlee.common.composites"]
