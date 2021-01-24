# Go Native

## Install GraalVM with SDKMAN (Optional - clean system)
`curl -s "https://get.sdkman.io" | bash`
`source "$HOME/.sdkman/bin/sdkman-init.sh"`
`sdk install java 20.3.0.r11-grl`

### Check if GraalVM was installed successfully
`java -version`

### Install Maven, that uses GraalVM for later builds
`sdk install maven`

### Show Maven using GraalVM JDK
`mvn --version`

### Install GraalVM Native Image
`gu install native-image`

### Check if Native Image was installed properly
`native-image --version`

## Build
`mvn -Pnative,noTesting clean package`