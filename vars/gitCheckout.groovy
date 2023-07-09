def call(Map StageParams) {

    checkout([
        $class: 'GitSCM'
        branch: [[name:  StageParams.branch]],
        userRemoteConfigs: [[ url: StageParams.url ]]
    ])
 }