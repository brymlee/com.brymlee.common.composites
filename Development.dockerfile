FROM java:latest
COPY base.vimrc /root/.vimrc
RUN mkdir /com.brymlee.common.composites
COPY Application.dockerfile /com.brymlee.common.composites/Application.dockerfile
COPY build.sh /com.brymlee.common.composites/build.sh
COPY Java.dockerfile /com.brymlee.common.composites/Java.dockerfile
COPY run.sh /com.brymlee.common.composites/run.sh
COPY base.vimrc /com.brymlee.common.composites/base.vimrc
COPY Development.dockerfile /com.brymlee.common.composites/Development.dockerfile
COPY jump-into-development-environment.sh /com.brymlee.common.composites/jump-into-development-environment.sh
COPY src /com.brymlee.common.composites/src
COPY build-development-environment.sh /com.brymlee.common.composites/build-development-environment.sh
COPY example-compile.sh /com.brymlee.common.composites/example-compile.sh
COPY run-development-environment.sh /com.brymlee.common.composites/run-development-environment.sh
COPY sync.sh /com.brymlee.common.composites/sync.sh
WORKDIR /com.brymlee.common.composites
