
# run kafka
docker-compose up -d

# start proxy
ssh -R campibus.lhr.rocks:80:localhost:9092 plan@localhost.run