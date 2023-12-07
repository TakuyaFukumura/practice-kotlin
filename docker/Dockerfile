FROM ubuntu:latest

RUN apt update &&  \
    apt -y install curl zip unzip git

RUN adduser takuya-fukumura
USER takuya-fukumura

# install kotlin and java
RUN curl -s "https://get.sdkman.io" | bash
RUN bash -c ". $HOME/.sdkman/bin/sdkman-init.sh \
    && sdk install kotlin \
    && sdk install java"

# clone app
RUN cd $HOME && git clone https://github.com/TakuyaFukumura/practice-kotlin.git
