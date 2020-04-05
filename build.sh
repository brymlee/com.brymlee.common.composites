docker build -t java . --file Java.dockerfile
docker build -t com.brymlee.common.composites . --no-cache --file Development.dockerfile
