# clean, build the jar and the javadoc jar, install to local repo and deploy to network repo
mvn -s sonatype.xml clean package javadoc:jar install deploy