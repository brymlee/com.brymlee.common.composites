docker exec -it com.brymlee.common.composites su $(cat .whoami) - /bin/bash -c "export COLUMNS=`tput cols`; export LINES=`tput lines`; exec bash"
