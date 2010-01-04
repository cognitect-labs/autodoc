(import (java.io File))

(let [file-prefix (.getAbsolutePath (File. "../autodoc-work-area/clojure"))
      src-dir (str file-prefix "/src/")]
 {
  :project-name "Clojure",
  :file-prefix file-prefix,
  :src-dir src-dir,
  :src-root "src/clj",
  :web-src-dir "http://github.com/richhickey/clojure/blob/",

  :web-home "http://richhickey.github.com/clojure-contrib/",
  :output-directory (str file-prefix "/autodoc/"),
  :external-doc-tmpdir "/tmp/autodoc/doc",
  :jar-file (str src-dir "clojure-slim.jar"),

  :built-clojure-jar (str src-dir "/clojure-slim.jar"),

  :namespaces-to-document ["clojure.core" "clojure.inspector" "clojure.main" 
                            "clojure.set" "clojure.stacktrace" "clojure.template"
                            "clojure.test" "clojure.walk" "clojure.xml"
                            "clojure.zip"],

  :load-except-list 
  [ 
   #"clojure/core.clj"
   #"clojure/parallel.clj"
   ],

  :page-title "Clojure Core API Reference",
  :copyright "Copyright 2007-2009 by Rich Hickey",
  })
