def buildapp(){
  echo "building app"
}

def testapp(){
  echo "testing app"
}

def deployapp(){
  echo "deploying app"
  echo "deploying version ${params.versionn}"
}


return this
