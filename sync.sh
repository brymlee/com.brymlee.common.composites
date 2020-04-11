echo "Copy files as user:"
read user 
dir=com.brymlee.common.composites.development:/com.brymlee.common.composites
docker cp $dir/Application.dockerfile .
docker cp $dir/build.sh .
docker cp $dir/Java.dockerfile .
docker cp $dir/run.sh .
docker cp $dir/base.vimrc .
docker cp $dir/Development.dockerfile .
docker cp $dir/jump-into-development-environment.sh .
docker cp $dir/src .
docker cp $dir/build-development-environment.sh .
docker cp $dir/example-compile.sh .
docker cp $dir/run-development-environment.sh .
docker cp $dir/sync.sh . 
chown $user ../com.brymlee.common.composites -R
