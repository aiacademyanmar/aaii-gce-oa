import json
from pathlib import Path

p = Path("content/v2_9/subjects.json")
if not p.is_file():
    raise SystemExit("Missing content/v2_9/subjects.json")
data = json.loads(p.read_text(encoding="utf-8"))
required = {
    "version", "status", "examBoards", "teachingLanguages",
    "firstBoard", "subjects"
}
missing = required - data.keys()
if missing:
    raise SystemExit(f"Missing content keys: {sorted(missing)}")
expected = {"Cambridge IGCSE", "Oxford AQA", "Pearson Edexcel"}
if set(data["examBoards"]) != expected:
    raise SystemExit("Exam board configuration does not match approved setup")
if data["firstBoard"] != "Cambridge IGCSE":
    raise SystemExit("First exam board must be Cambridge IGCSE")
if not isinstance(data["subjects"], list):
    raise SystemExit("subjects must be a JSON list")
print("GCSE LanPya V2.9 starter content validation passed.")
print(f"Exam boards configured: {len(data['examBoards'])}")
print(f"Bundled subjects: {len(data['subjects'])} (full syllabus content still pending)")
