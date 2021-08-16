
# run kafka
docker-compose up -d

# payment service integration setup

npm install -g json-server

json-server --watch db.json --port 3004