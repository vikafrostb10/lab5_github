pipeline {

    checkout scm

    docker.withRegistry('https://registry.hub.docker.com', 'dockerHub') {

        def customImage = docker.build("frost103/lab5")

        /* Push the container to the custom Registry */
        customImage.push()
    }
}
