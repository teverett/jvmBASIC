cp ../jvmbasicc/target/jvmbasicc.jar .
cp ../jvmbasicrt/target/jvmbasicrt.jar .
cp ../jvmbasicc/src/main/resources/manifest.txt .
tar cf demo.tar *.jar run.sh bottlesofbeer.bas
gzip demo.tar


