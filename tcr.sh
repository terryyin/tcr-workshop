revert() {
    git checkout HEAD -- src && git reset HEAD src/ -- && git clean -fd && echo 'reverted'
}

commit() {
    git commit -am "working" && echo 'committed'
}

gradle test && commit || revert