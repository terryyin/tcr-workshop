test() {
    gradle test
}

revert() {
    DIR_TO_REVERT="src/main"
    git checkout HEAD -- $DIR_TO_REVERT && git reset HEAD $DIR_TO_REVERT -- && git clean -fd $DIR_TO_REVERT && echo 'reverted'
}

commit() {
    git commit -am "working" && echo 'committed'
}

test && commit || revert