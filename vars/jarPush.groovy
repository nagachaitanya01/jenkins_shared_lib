def call(){
    sh 'curl -X PUT -u admin:Bnc@1234 -T kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://54.236.8.228:8082/artifactory/example-repo-local/'
}
