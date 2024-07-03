doc_dir=$(eval echo ~$USER/Documents/Docker_demo)

pwd doc_dir

git pull

docker stop $(docker ps -q)

docker rmi java
docker rmi react

cd Java

docker build -t java