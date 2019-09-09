DIR_TO_MONITOR="lib spec"

fswatch -r $DIR_TO_MONITOR | (while read; do ./tcr.sh; done)