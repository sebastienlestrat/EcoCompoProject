import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
@Component({
  selector: 'app-tab4',
  templateUrl: './tab4.page.html',
  styleUrls: ['./tab4.page.scss'],
})
export class Tab4Page implements OnInit {

   userForm!: FormGroup;

  constructor(private formBuilder: FormBuilder) { }

  onSubmitForm() : void {
    const formData = new FormData();
    formData.append('username', this.userForm.value.username);
    formData.append('email', this.userForm.value.email);
    formData.append('photo', this.userForm.value.photo);


  }

  onFileSelected(event: any) {
    if (event.target.files.length > 0) {
      const file = event.target.files[0];
      if (this.userForm) {
        const avatarControl = this.userForm.get('photo');
        if (avatarControl) {
          avatarControl.setValue(file);
        }
      }
    }
  }

  ngOnInit(): void {
    this.userForm = this.formBuilder.group({
      username: ['', [Validators.required]],
      email: ['', [Validators.required, Validators.email]],
      photo: [null]
    }, {
      updateOn: 'blur'
    });
  }
}
