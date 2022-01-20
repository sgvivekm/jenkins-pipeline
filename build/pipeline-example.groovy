String message = 'Inside build groovy file'
println message

def exampleMethod(val) {
    sh """
        echo "from build function : ${val}"
        """
}

return this
