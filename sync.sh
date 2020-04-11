echo "Copy files as user:"
read user 
docker cp com.brymlee.common.composites.development:/com.brymlee.common.composites ..
chown $user ../com.brymlee.common.composites -R
