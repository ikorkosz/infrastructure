FROM jenkins/ssh-agent:4.2.1-jdk11
RUN apt-get update \ 
    && apt-get install  -y python3 curl python3-pip git \
    && groupadd  docker \
    && usermod -aG docker jenkins
RUN curl -fsSL https://get.docker.com | sh