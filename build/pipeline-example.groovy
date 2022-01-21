String message = 'Inside build groovy file'
println message

def exampleMethod(props) {
    sh """
        echo "from build function : ${props}"
        """
    if(props.build.tool instanceof String) {
        if(props.build.tool.contains(",")) props.build.tool = props.build.tool.split(",")
        else props.build.tool = [props.build.tool]
    }    
    props.build.tool.each {
        println it 
        if(!props.build."${it}") props.build."${it}" = [:]
        if(!props.build."${it}".disabled) {
            println(it + " inside foreach")
            println(!props.build."${it}")
            println(!props.build."${it}".disabled)
        }
    }
}

return this
