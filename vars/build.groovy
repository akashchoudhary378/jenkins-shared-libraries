def call(String name , String tag)
{
  echo "this is building the code"
  sh "docker build -t ${name}:${tag} ."
}
