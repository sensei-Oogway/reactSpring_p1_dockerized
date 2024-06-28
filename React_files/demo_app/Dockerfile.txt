FROM node:20.15-slim 

WORKDIR /opt/reactApp

COPY /public /opt/reactApp/public
COPY /src /opt/reactApp/src
COPY /package.json /opt/reactApp/
COPY /package-lock.json /opt/reactApp/

RUN npm install

CMD [ "npm", "start" ]