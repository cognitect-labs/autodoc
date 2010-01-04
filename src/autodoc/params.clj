(ns autodoc.params)

;;; 
;;; Default values for settable parameters. These are overridden in the
;;; per project parameters file.
;;;

(def default-params
     {:project-name nil,
      :param-dir "autodoc-params",

      :file-prefix nil,
      :src-dir ".",
      :src-root "src",
      :web-src-dir nil,

      :web-home nil,
      :output-directory "autodoc",
      :external-doc-tmpdir nil,
      :ext-dir nil,

      :clojure-contrib-jar nil,
      :clojure-contrib-classes nil,

      :built-clojure-jar nil,
      :namespaces-to-document nil,
      :trim-prefix nil,

      :do-load true,
      :load-except-list [],
      :build-json-index false,

      :page-title nil,
      :copyright "No copyright info"
      })

(defonce params default-params)

(defn merge-params 
  "Merge the param map supplied into the params defined in the params var"
  [param-map]
  (alter-var-root #'params merge param-map))

(defn params-from-dir 
  "Read param.clj from the specified directory and set the params accordingly"
  [param-dir]
  (merge-params (merge {:param-dir param-dir} (load-file (str param-dir "/params.clj")))))
