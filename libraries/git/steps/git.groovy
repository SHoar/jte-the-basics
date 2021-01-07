void add(List files){
    println "git add ${files.join(" ")}"
}

void commit(String message){
    println "git commit -m ${message}"
}

void push(){
    println "git push"
}
