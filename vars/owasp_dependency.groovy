def call(String nvdApiKey){
    dependencyCheck(
        additionalArguments: "--scan ./ --nvdApiKey ${nvdApiKey}",
        odcInstallation: 'OWASP'
    )

    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
