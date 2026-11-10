Push-Location $PSScriptRoot
try {
    java -jar "gradle\wrapper\gradle-wrapper.jar" @args
}
finally {
    Pop-Location
}
