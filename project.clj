(defproject demo-interop "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]


  ;; http://hypirion.com/musings/advanced-intermixing-java-clj

  :source-paths ["src/clj"]
  :java-source-paths ["src/java"]
  :prep-tasks [  ;; compile du code qui doit être appelé par Java
                ["compile" "demo-interop.model"]

                ;; compile du code JAva
                "javac" 

                ;; compile du reste du code Clojure

                "compile"]

  :main demo-interop.core

  )
