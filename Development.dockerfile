FROM java:latest
COPY base.vimrc /root/.vimrc
ADD . /com.brymlee.common.composites
RUN cp /com.brymlee.common.composites/.passwd /etc/passwd
RUN cp /com.brymlee.common.composites/.shadow /etc/shadow
RUN cp /com.brymlee.common.composites/.group /etc/group
RUN cp /com.brymlee.common.composites/.gshadow /etc/gshadow
RUN su $(cat /com.brymlee.common.composites/.whoami)
RUN mkdir /home/$(cat /com.brymlee.common.composites/.whoami)
ADD .ssh /.ssh 
RUN mv /.ssh /home/$(cat /com.brymlee.common.composites/.whoami)/.ssh 
RUN git config --system user.email $(cat /com.brymlee.common.composites/.user.email)
RUN git config --system user.name $(cat /com.brymlee.common.composites/.user.name)
RUN chown ubuntu /com.brymlee.common.composites -R
