FROM node:20.15-slim 

RUN mkdir -p /opt/reactApp
WORKDIR /opt/reactApp

COPY /package.json /opt/reactApp/
COPY /package-lock.json /opt/reactApp/

RUN npm install

COPY /public /opt/reactApp/public
COPY /src /opt/reactApp/src

CMD [ "npm", "start" ]