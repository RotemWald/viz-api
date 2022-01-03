FROM gradle:7.3.3-jdk8

WORKDIR /viz-api
COPY . .
RUN gradle clean build

CMD gradle bootRun