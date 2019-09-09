test() {
    rspec
}

revert() {
    DIR_TO_REVERT="lib"
    git checkout HEAD -- $DIR_TO_REVERT && git reset HEAD $DIR_TO_REVERT -- && git clean -fd $DIR_TO_REVERT
}

commit() {
    git commit -am "working"
}

test && commit || revert