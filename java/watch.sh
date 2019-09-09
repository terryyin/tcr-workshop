DIR_TO_MONITOR="src"

fswatch -r $DIR_TO_MONITOR | (while read; do ./tcr.sh; done)