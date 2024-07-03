doc_dir=$(eval echo ~$USER/Documents/Docker_demo)

cd $doc_dir

git pull

# docker stop $(docker ps -q)
# docker rm $(docker ps -q -a)

# docker rmi java
# docker rmi react

# cd Java

# docker build -t java .

# cd ../React_files/demo_app

# docker build -t react .

# cd $doc_dir

docker-compose up -d --build

