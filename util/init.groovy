def now() {
    println("inside init.groovy")
    props= readYaml file: "app.yml"
    println("yaml :" + props)
}

return this