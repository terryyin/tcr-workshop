revert() {
    git checkout HEAD -- src/main && git reset HEAD src/main -- && git clean -fd src/main && echo 'reverted'
}

commit() {
    git commit -am "working" && echo 'committed'
}

gradle test && commit || revert