
set d=%date:~,10%
set d=%d:-=%
set d=%d:/=%


git add -A
git commit -m %d%
git push   