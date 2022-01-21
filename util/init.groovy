def now() {
    println("inside init.groovy")
    props= readYaml file: "app.yml"
}

return this