def call(string name , string tag)
{
  echo "this is building the code"
  sh "docker build -t ${name}:${tag} ."
}
