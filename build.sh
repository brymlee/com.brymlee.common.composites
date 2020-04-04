echo $(git config user.email) > .user.email
echo $(git config user.name) > .user.name
cp /home/$(cat .whoami)/.ssh . -r
cp /etc/passwd .
mv passwd .passwd
cp /etc/shadow .
mv shadow .shadow
cp /etc/group .
mv group .group
cp /etc/gshadow .
mv gshadow .gshadow
docker build -t java . --file Java.dockerfile
docker build -t com.brymlee.common.composites . --no-cache --file Development.dockerfile
