FROM maptiler/tileserver-gl:latest
WORKDIR /home/saitejachary/Desktop/map-server
COPY styles /styles/
CMD ["tileserver-gl", "--config", "/config/config.json"]
