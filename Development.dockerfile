FROM java:latest
COPY base.vimrc /root/.vimrc
ADD . /com.brymlee.common.composites
