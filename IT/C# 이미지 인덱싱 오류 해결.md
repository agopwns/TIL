C# 이미지 인덱싱 오류 해결법

http://fci-h.blogspot.com/2008/02/c-indexed-pixel-problem.html

Here I will mention the solve for a common problem happens when you try to create Graphic object from Bitmap images as in the next two lines..yes, it would fire an exception if your bitmap was indexed pixel .

Bitmap tmp = new Bitmap("Fci-h.jpg");

Graphics grPhoto = Graphics.FromImage(tmp);

Exception : "A Graphics object cannot be created from an image that has an indexed pixel format".


To pass this exception you will need to add some additional lines of code . Just create an image with the same size like the original image (Fci-h.jpg) then draw the original image onto the new Graphics object .

Here is an Example :

Bitmap bm = (Bitmap) System.Drawing.Image.FromFile("Fci-h.jpg",true);

Bitmap tmp=new Bitmap (bm.Width ,bm.Height );

Graphics grPhoto = Graphics.FromImage(tmp);

grPhoto.DrawImage(bm, new Rectangle(0, 0, tmp.Width , tmp.Height ), 0, 0, tmp.Width , tmp.Height , GraphicsUnit.Pixel);