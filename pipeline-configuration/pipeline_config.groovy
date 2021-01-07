@merge libraries {
    sonarqube
}

jte {
    allow_scm_jenkinsfile = false
}

steps {
  unit_test{
  	stage = "Unit Test"
    image = "maven"
    command = "mvn -v"
  }
}
