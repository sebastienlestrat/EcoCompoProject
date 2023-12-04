import { Component, OnInit } from '@angular/core';
import { UntypedFormBuilder, UntypedFormGroup, Validators } from '@angular/forms';
import { TokenService } from '../service/token.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage implements OnInit {
  loginForm? : UntypedFormGroup
  submitted : boolean = false


  constructor(private formBuilder : UntypedFormBuilder, private tokenService = TokenService) { }

  ngOnInit() {
    this.loginForm = this.formBuilder.group({
      email : ['user@gmail.com', Validators.required],
      password : ['password', Validators.required]
    })
  }

  onSubmit() {
    // stop here if form is invalid 
    if(!this.loginForm || this.loginForm.invalid) {
      return;
    }
    // get email and password
    let email = this.loginForm.get('email')?.value;
    let pass = this.loginForm.get('password')?.value;

    this.proceedLogin(email, pass);
  }


  private proceedLogin(email: string, pass: string) {
    this.submitted = true;
    // call tokenService for connexion
      this.tokenService.login(email, pass).subscribe({
        next : (rToken: any) => console.log('token récuperé : %s', rToken),
        error : (e: Error) => console.error(e), 
        complete : () => {
          console.info('complete')
          this.submitted = false
        }
      })
    
  }

}
