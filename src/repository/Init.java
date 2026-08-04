Class Init{
static void init(){

    File directory = new File("/Users/kapiljoshi/coding_files/Projects/Jgit/Jgit/src/.jgit");
    File commits = new File(directory, "commits");
    File objects = new File(directory , "objects");
    File refs = new File(directory , "refs");
    File HEAD = new File(directory, "HEAD");
    try {
        directory.mkdirs();
        commits.mkdirs();
        objects.mkdirs();
        refs.mkdirs();

        if (!HEAD.exists()) {
            HEAD.createNewFile();
        }
        System.out.println("Repository Initialized Sussessfully");

    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
        }