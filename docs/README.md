# E-Commerce System
Product Module จัดทำโดย กลุ่ม **S.O.Pang**

**รายชื่อสมาชิก**
1. นางสาวเกศราณี ไตรสวัสดิ์วงศ์ รหัสนักศึกษา 61070018
2. นายคุณากร โฆสิตสกุล รหัสนักศึกษา 61070020
3. นางสาวฉัตรธิดา แจ้งใจ รหัสนักศึกษา 61070029
4. นายชาญวิทย์ เศรษฐวงศ์สิน รหัสนักศึกษา 61070040
5. นายนรรณจา โสวรรณ รหัสนักศึกษา 61070097

**มีคำถามติดต่อทาง [Facebook](https://www.facebook.com/tan.kositsakul/) ไลน์ถ้าไม่ตอบไม่ว่ากันนะฮะ**

## User Interface
[https://tanknk.github.io/E-CommerceSystem/](https://tanknk.github.io/E-CommerceSystem/)<br><br>
**หมายเหตุ:** 1. เนื่องจากยังไม่ได้ลงรายละเอียดในส่วนของการทำงาน จึงไม่สามารถทำงานอื่นได้ (Search, Create, Update, Delete) นอกจากการแสดงรายละเอียด (Read)

## Product Services
* การสร้างรายการสินค้าใหม่ (Create)
* การดูรายละเอียดของรายการสินค้า (Read)
* การแก้ไขข้อมูลรายละเอียดของรายการสินค้า (Update)
* การลบรายการสินค้า (Delete)
* การค้นหารายการสินค้า (Search)

## Product Database (Logical Design)
![Product Database (Logical Design)](https://github.com/tanknk/E-CommerceSystem/blob/Product/assets/images/Product_db.png)
**รายละเอียด**
1. สินค้า (Product) มีการเก็บข้อมูลดังนี้
    * รหัสของสินค้า (id)
    * ชื่อของสินค้า (name)
    * ราคาของสินค้า (price)
    * รายละเอียดของรสินค้า (description)
    * ยอดคงคลังของสินค้า (amount)
    * รูปภาพของสินค้า (picture)
    * น้ำหนักของสินค้า (weight)
    * รหัสของร้านค้าที่เป็นผู้ขายสินค้านั้น ๆ (shop_id)
    * รหัสของยี่ห้อของสินค้า (brand_id)
    * รหัสของหมวดหมู่ของสินค้า (category_id)
    
2. ยี่ห้อ (Brand) มีการเก็บข้อมูลดังนี้
      * รหัสของยี่ห้อ (id)
      * ชื่อของยี่ห้อ (name)

3. หมวดหมู่ (Category) มีการเก็บข้อมูลดังนี้
      * รหัสของหมวดหมู่ (category)
      * ชื่อของหมวดหมู่ (name)
    
**หมายเหตุ:** 1. ตาราง SHOP และ ORDER รอรายละเอียดจากกลุ่มที่ทำ Module นั้น ๆ
